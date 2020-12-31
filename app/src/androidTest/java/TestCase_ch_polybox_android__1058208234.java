import android.accounts.Account;
import android.content.SyncRequest.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_polybox_android__1058208234 {
   @Test
   public void testCase() throws Exception {
      Builder var3 = new Builder();
      Object var1 = EasyMock.createMock(Account.class);
      String var2 = "android";
      var3.setSyncAdapter((Account)var1, var2);
   }
}
