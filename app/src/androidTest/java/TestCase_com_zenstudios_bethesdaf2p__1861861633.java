import android.app.Activity;
import android.content.ComponentName;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_zenstudios_bethesdaf2p__1861861633 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = new ActivityTestRule(Activity.class);
      Activity var4 = var3.getActivity();
      boolean var1 = true;
      Object var2 = EasyMock.createMock(ComponentName.class);
      var4.setVrModeEnabled(var1, (ComponentName)var2);
   }
}
