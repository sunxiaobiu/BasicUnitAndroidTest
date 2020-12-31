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
public class TestCase_abc_apple_emoji_theme_gif_keyboard_818136739 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      AssetManager var5 = var4.getAssets();
      AssetFileDescriptor var6 = var5.openFd("relax_tick.mp3");
      long var1 = var6.getLength();
   }

   public TestCase_abc_apple_emoji_theme_gif_keyboard_818136739() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
