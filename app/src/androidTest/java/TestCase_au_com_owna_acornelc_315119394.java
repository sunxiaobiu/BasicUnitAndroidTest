import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_owna_acornelc_315119394 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(RecyclerView.class);
      ViewCompat.setNestedScrollingEnabled((View)var0, false);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
