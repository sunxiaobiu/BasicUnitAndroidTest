import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_audiocutter_videocutter_audiovideocutter_1037000599 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(View.class);
      Drawable var2 = ((View)var1).getBackground();
      BitmapDrawable var3 = (BitmapDrawable)var2;
      var3.mutate();
   }
}
