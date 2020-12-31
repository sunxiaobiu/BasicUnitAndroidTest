import android.app.Activity;
import android.support.v7.widget.AppCompatButton;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_slikr_slikr__1168023611 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296395);
      AppCompatButton var4 = (AppCompatButton)var3;
      var4.setTransformationMethod((TransformationMethod)null);
   }

   public TestCase_au_com_slikr_slikr__1168023611() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
