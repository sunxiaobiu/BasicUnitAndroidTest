import android.app.Activity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_899AEC761578FBE8E15815CB8F96288C955FD63BBD0ABF41849365507D482720_126511765 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      Object var3 = EasyMock.createMock(Object.class);
      var2 = (Activity)var3;
      boolean var4 = var2.isChild();
   }
}
