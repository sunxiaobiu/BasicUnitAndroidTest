import android.support.v4.view.ViewCompat;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fotoable_fotobeauty__677318545 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(View.class);
      float var1 = ViewCompat.getTranslationY((View)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
