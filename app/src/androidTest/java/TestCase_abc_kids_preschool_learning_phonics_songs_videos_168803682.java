import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_kids_preschool_learning_phonics_songs_videos_168803682 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(View.class);
      Context var6 = InstrumentationRegistry.getTargetContext();
      Resources var7 = var6.getResources();
      DisplayMetrics var1 = var7.getDisplayMetrics();
      int var8 = var1.heightPixels;
      int var9 = var1.widthPixels;
      Rect var2 = new Rect(0, 0, var9, var8);
      byte var3 = 1;
      byte var4 = 1;
      var2.intersect(var9, var8, var3, var4);
   }
}
