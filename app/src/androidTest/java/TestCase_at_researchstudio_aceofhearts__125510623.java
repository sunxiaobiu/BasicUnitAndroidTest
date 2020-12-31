import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.drawable.Drawable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_researchstudio_aceofhearts__125510623 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      ProgressDialog var3 = new ProgressDialog(var1);
      Object var4 = EasyMock.createMock(Drawable.class);
      var3.setProgressDrawable((Drawable)var4);
   }

   public TestCase_at_researchstudio_aceofhearts__125510623() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
