import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_opal_travel_553493586 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(AppCompatImageView.class);
      ViewCompat.setTranslationZ((View)var0, 0.1F);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
