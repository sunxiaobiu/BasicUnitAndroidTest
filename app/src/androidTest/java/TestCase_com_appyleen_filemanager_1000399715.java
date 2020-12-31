import android.support.design.widget.Snackbar;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appyleen_filemanager_1000399715 {
   @Test
   public void testCase() throws Exception {
      StringBuilder var2 = new StringBuilder();
      String var3 = var2.toString();
      Object var1 = EasyMock.createMock(View.class);
      Snackbar var4 = Snackbar.make((View)var1, var3, -1);
      var4.setText(var3);
   }
}
