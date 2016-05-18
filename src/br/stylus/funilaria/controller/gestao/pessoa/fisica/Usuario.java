package br.stylus.funilaria.controller.gestao.pessoa.fisica;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Usuario {
    
    private String nomeUsuario;
    private String tipo;
    private String senha;
    
    public Usuario() {}
    
    public Usuario(String nomeUsuario, String tipo, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.tipo = tipo;
        this.senha = senha;
    }

     public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public byte[] criptografarSenha(){
        
         byte[] senhaCriptografada = null;
         
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecretKey secretKey = keyGenerator.generateKey();
            Cipher cipher; 
            cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            senhaCriptografada = cipher.doFinal(this.getSenha().getBytes());
          
      
        } catch (NoSuchAlgorithmException ex) {
            //Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
          //  Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
           // Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
        }  catch (IllegalBlockSizeException ex) {
         //   Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
           // Logger.getLogger(Criptografia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return senhaCriptografada;
    }
    
}