import android.app.Activity;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0C8DB42071C0C081122608B579406C496F8B74DBBC21226FB55F4D3360DB1E14__151741402 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131362146);
      AppCompatEditText var4 = (AppCompatEditText)var3;
      var4.setHint("example: \"Thanksgiving\"");
   }

   public TestCase_0C8DB42071C0C081122608B579406C496F8B74DBBC21226FB55F4D3360DB1E14__151741402() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
