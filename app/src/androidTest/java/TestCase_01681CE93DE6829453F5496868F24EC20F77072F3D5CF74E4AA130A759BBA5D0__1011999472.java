import android.app.Activity;
import android.content.res.Configuration;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01681CE93DE6829453F5496868F24EC20F77072F3D5CF74E4AA130A759BBA5D0__1011999472 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var1 = EasyMock.createMock(Configuration.class);
      var3.onConfigurationChanged((Configuration)var1);
   }

   public TestCase_01681CE93DE6829453F5496868F24EC20F77072F3D5CF74E4AA130A759BBA5D0__1011999472() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
