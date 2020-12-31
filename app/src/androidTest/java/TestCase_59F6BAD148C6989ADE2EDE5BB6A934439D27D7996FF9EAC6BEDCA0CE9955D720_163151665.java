import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F6BAD148C6989ADE2EDE5BB6A934439D27D7996FF9EAC6BEDCA0CE9955D720_163151665 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      DrawableCompat.jumpToCurrentState((Drawable)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
