import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_67BBBDFBC1F9CD27EBF07988705B042FDB0FAD5DDE7EF2D5D691792CA7CE13E8_1630523261 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131297403);
      AppCompatCheckedTextView var5 = (AppCompatCheckedTextView)var4;
      boolean var1 = true;
      var5.setChecked(var1);
   }

   public TestCase_67BBBDFBC1F9CD27EBF07988705B042FDB0FAD5DDE7EF2D5D691792CA7CE13E8_1630523261() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
