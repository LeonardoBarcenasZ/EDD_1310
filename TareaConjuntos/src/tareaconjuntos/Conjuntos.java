/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaconjuntos;

import java.util.ArrayList;

/**
 *
 * @author Mayra
 */
public class Conjuntos<T> implements Iterable {
    
    ArrayList<T> data = new ArrayList<>();
    
    public int length(){
        return data.size();
    }
    
    public boolean contains(T value){
        return data.indexOf(value) != -1;
    }
    
    public void add(T value){
        if(!contains(value)){
            data.add(value);
       }
    }
    
    public void remove(T value){
        data.remove(value);
    }
    
    public boolean equals(Conjuntos<T> other){
        if(length() != other.length()){
            return false;
    }
    for(int i = 0; i < length(); i++){
        if(!other.contains(data.get(i))){
            return false;
        }
    }
    return true;
    }
    
    public boolean isSubset(Conjuntos<T> other){
        if(length() > other.length()){
            return false;
    }
    for(int i = 0; i < length(); i++){
        if(!other.contains(data.get(i))) {
            return false;
        }
    }
    return true;
    }
    
    public void union(Conjuntos<T> other) {
        for(int i = 0; i < other.length(); i++){
        add(other.data.get(i));
        }
    }
    
    public Conjuntos<T> intersection(Conjuntos<T> other) {
        Conjuntos<T> result = new Conjuntos();
        for(int i = 0; i < length(); i++) {
            if(other.contains(data.get(i))) {
                result.add(data.get(i));
            }
        }
        return result;
    }

    public Conjuntos<T> difference(Conjuntos<T> other) {
        Conjuntos<T> result = new Conjuntos();
        for(int i = 0; i < length(); i++) {
            if(!other.contains(data.get(i))) {
                result.add(data.get(i));
            }
        }
        for(int i = 0; i < other.length(); i++) {
            if(!contains(other.data.get(i))) {
                result.add(other.data.get(i));
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return data.toString();
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.size();
            }

            @Override
            public T next() {
                return data.get(index++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
    
}
