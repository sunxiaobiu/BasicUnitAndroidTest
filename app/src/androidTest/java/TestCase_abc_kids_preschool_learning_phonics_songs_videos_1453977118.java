import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_kids_preschool_learning_phonics_songs_videos_1453977118 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("display");
      DisplayManager var3 = (DisplayManager)var2;
      Display var4 = var3.getDisplay(0);
   }
}
