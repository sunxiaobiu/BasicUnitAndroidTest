import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.widget.ListView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app_1671374588 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Dialog.class);
      AlertDialog var2 = (AlertDialog)var1;
      ListView var3 = var2.getListView();
   }
}
