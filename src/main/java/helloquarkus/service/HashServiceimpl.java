package helloquarkus.service;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import java.util.Base64;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class HashServiceimpl implements HashService {
    private String salt = "#blahxyz17";
    private Integer iterationCount = 405;
    private Integer keyLength = 512;

    @Override
    public String getHashSenha(String senha) {
        try {
            byte[] result = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512")
            .generateSecret(
                new PBEKeySpec(senha.toCharArray(), salt.getBytes(), iterationCount, keyLength)
                )
                .getEncoded();
                return Base64.getEncoder().encodeToString(result);
                } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new RuntimeException(e);
        }
    }
     public static void main(String[] args) {
        HashService service = new HashServiceimpl();
        System.out.println();
        System.out.println(service.getHashSenha("123"));
         /* System.out.println(service.getHashSenha("ana"));
        System.out.println(service.getHashSenha("anA"));  */
    } 
}
