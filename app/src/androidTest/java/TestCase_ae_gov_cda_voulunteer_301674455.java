import android.support.v4.app.NotificationCompat.BigTextStyle;
import android.text.Spanned;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_cda_voulunteer_301674455 {
   @Test
   public void testCase() throws Exception {
      BigTextStyle var2 = new BigTextStyle();
      Object var1 = EasyMock.createMock(Spanned.class);
      var2.setSummaryText((CharSequence)var1);
   }
}
