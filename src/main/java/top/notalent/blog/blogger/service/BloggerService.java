package top.notalent.blog.blogger.service;

/**
 * BloggerService
 * @author Roy Chen
 * 2019-07-28 11:24
 * @version 1.0
 **/
public interface BloggerService {

    /**
     * <p> Blogger register. </p>
     * @param username username
     * @param password password
     */
    void register(String username, String password);

    /**
     * <p> Username judging: is the username valid ? </p>
     * <p> Return true if and only if the username valid, or else return false. </p>
     * @param username username
     * @return isValid
     */
    boolean isUsernameValid(String username);

    /**
     * <p> Update Blogger account's password. </p>
     * @param username username
     * @param password password
     */
    void updatePassword(String username, String password);

}
