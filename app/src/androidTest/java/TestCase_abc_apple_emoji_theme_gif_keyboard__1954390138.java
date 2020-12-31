import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_apple_emoji_theme_gif_keyboard__1954390138 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      AssetManager var3 = var2.getAssets();
      AssetFileDescriptor var4 = var3.openFd("relax_tick.mp3");
   }

   public TestCase_abc_apple_emoji_theme_gif_keyboard__1954390138() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
