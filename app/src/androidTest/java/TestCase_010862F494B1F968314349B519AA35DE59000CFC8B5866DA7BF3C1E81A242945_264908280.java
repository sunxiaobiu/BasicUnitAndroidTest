import android.app.NotificationChannel;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_010862F494B1F968314349B519AA35DE59000CFC8B5866DA7BF3C1E81A242945_264908280 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(String.class);
      StringBuilder var1 = new StringBuilder();
      String var5 = var1.toString();
      Object var2 = EasyMock.createMock(String.class);
      NotificationChannel var6 = new NotificationChannel((String)var2, (CharSequence)var3, 3);
      String var4 = "android";
      var6.setDescription(var4);
   }
}
