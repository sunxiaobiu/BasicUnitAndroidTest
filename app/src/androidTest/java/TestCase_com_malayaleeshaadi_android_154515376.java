import android.app.Activity;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_malayaleeshaadi_android_154515376 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131363289);
      AppCompatEditText var4 = (AppCompatEditText)var3;
      OnFocusChangeListener var5 = var4.getOnFocusChangeListener();
   }

   public TestCase_com_malayaleeshaadi_android_154515376() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
