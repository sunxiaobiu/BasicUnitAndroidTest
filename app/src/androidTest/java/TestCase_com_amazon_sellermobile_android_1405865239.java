import android.accounts.AccountManagerFuture;
import androidx.test.runner.AndroidJUnit4;
import java.util.concurrent.TimeUnit;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amazon_sellermobile_android_1405865239 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AccountManagerFuture.class);
      Object var1 = null;
      ((AccountManagerFuture)var2).getResult(5L, (TimeUnit)var1);
   }
}
