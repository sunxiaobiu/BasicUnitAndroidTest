import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_akkad_rullo__1284046449 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var6 = new ActivityTestRule(Activity.class);
      Activity var7 = var6.getActivity();
      Object var1 = EasyMock.createMock(IntentSender.class);
      Object var2 = EasyMock.createMock(Intent.class);
      byte var3 = 1;
      byte var4 = 1;
      byte var5 = 1;
      var7.startIntentSenderForResult((IntentSender)var1, 10001, (Intent)var2, var3, var4, var5);
   }
}
