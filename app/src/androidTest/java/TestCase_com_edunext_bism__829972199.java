import android.app.Activity;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_edunext_bism__829972199 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      GestureLibrary var3 = GestureLibraries.fromRawResource(var2, 2131296256);
      boolean var4 = var3.load();
   }

   public TestCase_com_edunext_bism__829972199() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
