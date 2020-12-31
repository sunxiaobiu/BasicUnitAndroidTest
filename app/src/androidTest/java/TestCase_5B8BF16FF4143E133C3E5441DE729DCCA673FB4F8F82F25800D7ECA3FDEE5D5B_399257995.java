import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B8BF16FF4143E133C3E5441DE729DCCA673FB4F8F82F25800D7ECA3FDEE5D5B_399257995 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      int var1 = DrawableCompat.getAlpha((Drawable)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
