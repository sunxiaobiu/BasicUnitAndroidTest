import android.app.Activity;
import android.content.Intent;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_kaspersky_iot_scanner__1672913306 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      Object var1 = EasyMock.createMock(Intent.class);
      var3.shouldUpRecreateTask((Intent)var1);
   }
}
