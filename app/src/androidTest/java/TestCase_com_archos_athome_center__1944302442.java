import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_archos_athome_center__1944302442 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      FragmentManager var5 = var4.getFragmentManager();
      Object var1 = EasyMock.createMock(Bundle.class);
      String var2 = "android";
      var5.getFragment((Bundle)var1, var2);
   }

   public TestCase_com_archos_athome_center__1944302442() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
