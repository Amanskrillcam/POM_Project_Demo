package Interface;

import java.io.IOException;

public interface LoginPageInterface {
    public String ValidateLoginPageTitle();
    public void userLogin() throws IOException;
    public void forgotPass();
}
