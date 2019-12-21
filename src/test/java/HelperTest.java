import lombok.SneakyThrows;
import org.junit.Assert;
import org.junit.Test;


public class HelperTest extends AuthBase {

    @SneakyThrows
    @Test
    public void findText(){
        int i = 0;
        applicationManager.getFindTextHelper().find();
        applicationManager.getBackHelper().backFromFind();
        String login = applicationManager.getLoginHelper().getUsername();
        Assert.assertEquals(applicationManager.getReceivedData().getValidCredentials().getLogin(), login);
    }


    @SneakyThrows
    @Test
    public void createPage(){
        applicationManager.getCreateEntityHelper().create();
        applicationManager.getBackHelper().backFromCreate();
        String login = applicationManager.getLoginHelper().getUsername();
        Assert.assertEquals(applicationManager.getReceivedData().getValidCredentials().getLogin(), login);
    }

    @SneakyThrows
    @Test
    public void openPda(){
        applicationManager.getOpenPdaVersionHelper().openPda();
        applicationManager.getBackHelper().backFromPda();
        String login = applicationManager.getLoginHelper().getUsername();
        Assert.assertEquals(applicationManager.getReceivedData().getValidCredentials().getLogin(), login);
    }

}
