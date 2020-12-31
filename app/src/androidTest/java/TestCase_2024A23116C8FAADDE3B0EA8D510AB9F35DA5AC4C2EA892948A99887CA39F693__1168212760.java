import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2024A23116C8FAADDE3B0EA8D510AB9F35DA5AC4C2EA892948A99887CA39F693__1168212760 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131362089);
      AppCompatSpinner var4 = (AppCompatSpinner)var3;
      var3 = var4.getSelectedView();
   }

   public TestCase_2024A23116C8FAADDE3B0EA8D510AB9F35DA5AC4C2EA892948A99887CA39F693__1168212760() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
