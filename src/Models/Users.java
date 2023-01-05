/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author aroua
 */
public class Users {
    private int id,cin, tel;
    private String username,prenom,email,password,repeatpassword,typeuser;
     

    public Users() {
    }

    public Users(int id, int cin, int tel, String username, String prenom, String email, String password, String repeatpassword, String typeuser) {
        this.id = id;
        this.cin = cin;
        this.tel = tel;
        this.username = username;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.repeatpassword = repeatpassword;
        this.typeuser = typeuser;

    }

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Users(int cin, int tel, String username, String prenom, String email, String password, String repeatpassword, String typeuser) {
        this.cin = cin;
        this.tel = tel;
        this.username = username;
        this.prenom = prenom;
        this.email = email;
        this.password = password;
        this.repeatpassword = repeatpassword;
        this.typeuser = typeuser;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", cin=" + cin + ", tel=" + tel + ", username=" + username + ", prenom=" + prenom + ", email=" + email + ", password=" + password + ", repeatpassword=" + repeatpassword + ", typeuser=" + typeuser + '}';
    }

 

   

   

    public int getId() {
        return id;
    }

    public int getCin() {
        return cin;
    }

    public int getTel() {
        return tel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

 

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRepeatpassword() {
        return repeatpassword;
    }

    public String getTypeuser() {
        return typeuser;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

   

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = DigestUtils.shaHex(password);
    }

    public void setRepeatpassword(String repeatpassword) {
        this.repeatpassword = DigestUtils.shaHex(repeatpassword);
    }

    public void setTypeuser(String typeuser) {
        this.typeuser = typeuser;
    }
   
}
