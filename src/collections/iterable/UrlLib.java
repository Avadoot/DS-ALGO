package collections.iterable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLib implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<>();

    public UrlLib() {
        urls.add("https://www.google.co.in");
        urls.add("https://www.facebook.com");
        urls.add("https://www.gmail.com");
    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }

    // Now lets assume we want a custom behavior wherein we want to download
    // the page content while iterating in the same.

    // Lets add an inner class here which has access to urls.
    private class UrlIterator implements Iterator<String> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < urls.size();
        }

        @Override
        public String next() {
            return downloadContent(urls.get(index));
        }

        public String downloadContent(String currentUrl) {
            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(currentUrl);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String line;

                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    sb.append("\n"); // readLine() does not add newline char
                }

                br.close();
            } catch (MalformedURLException e) {
                System.out.println("Invalid url provided " + currentUrl);
            } catch (IOException e) {
                System.out.println("Could not download content for website: " + currentUrl);
            }

            index++; // move iterator to next index
            return sb.toString();
        }
    }
}
