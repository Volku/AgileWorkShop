/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module;

/**
 *
 * @author Rei
 */
public class Object {
    public int id;
    public String word;

    public int getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Object(int id, String word) {
        this.id = id;
        this.word = word;
    }
    
    
}
