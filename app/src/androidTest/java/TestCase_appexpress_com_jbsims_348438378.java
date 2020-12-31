import android.app.Activity;
import android.os.Bundle;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_appexpress_com_jbsims_348438378 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = new ActivityTestRule(Activity.class);
      Activity var4 = var3.getActivity();
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Bundle.class);
      var4.showDialog(var1, (Bundle)var2);
   }
}
