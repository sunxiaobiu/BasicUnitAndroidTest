import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ADD71B27FB3875567628E9226907B93235AE62166A86023656C9D2DAA44FBB8__1552369742 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296441);
      ImageView var4 = (ImageView)var3;
      Drawable var5 = var4.getBackground();
      AnimationDrawable var6 = (AnimationDrawable)var5;
      boolean var7 = var6.isRunning();
   }

   public TestCase_5ADD71B27FB3875567628E9226907B93235AE62166A86023656C9D2DAA44FBB8__1552369742() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
