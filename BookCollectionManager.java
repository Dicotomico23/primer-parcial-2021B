package edu.uaslp.examen;

import java.util.*;

public class BookCollectionManager {
    private List<BookCollection> collections = new ArrayList<>();

    public BookCollection createCollection(String name) {
        BookCollection bookCollection = new BookCollection(name);
        collections.add(bookCollection);
        return bookCollection;
    }

    public BookCollection getCollectionByName(String name){
        for(int i=0;i<collections.size();i++){
            if(collections.get(i).getName().equals(name)) {
                return collections.get(i);
            }
        }
        return null;
    }

    public void deleteCollectionByName(String name){
        for (int i = 0; i < collections.size(); i++) {
            BookCollection collection = collections.get(i);
            if (collection.getName().equals(name)) collections.remove(collection);
        }
    }

    public void addBookToCollection(String CollectionName, Book book){
        BookCollection aux = getCollectionByName(CollectionName);
        if(aux != null){
            aux.addBook(book);
        }else{
            aux = createCollection(CollectionName);
            collections.add(aux);
        }
    }

    public List<String> getCollectionNames(){
        List<String> collectionNames = new ArrayList<>();
        for(int i=0;i<collections.size();i++){
            collectionNames.add(collections.get(i).getName());
        }
        return collectionNames;
    }
}
