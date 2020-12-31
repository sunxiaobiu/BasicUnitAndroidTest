import android.support.design.widget.Snackbar;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_polybox_android__1087897504 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Snackbar.class);
      byte var1 = 1;
      ((Snackbar)var2).setActionTextColor(var1);
   }
}
