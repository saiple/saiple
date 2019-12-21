import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.ArrayList;
import java.util.UUID;

public class Generator {

    @Getter
    ArrayList<Credentials> validCredentials = Lists.newArrayList(new Credentials("razil0071999@gmail.com", "password1"));

    public Sample generateRandomSample(){
        return new Sample(UUID.randomUUID().toString().replace("-", ""),
                UUID.randomUUID().toString().replace("-", ""));
    }

    public Credentials generateRandomCredentials(){
        return new Credentials(UUID.randomUUID().toString().replace("-", ""),
                UUID.randomUUID().toString().replace("-", ""));
    }

    public Credentials getValidCredential(){
        return validCredentials.get(0);
    }


}
