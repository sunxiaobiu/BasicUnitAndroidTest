import android.app.DatePickerDialog;
import android.app.Dialog;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appsay_1846058411 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(Dialog.class);
      DatePickerDialog var5 = (DatePickerDialog)var4;
      byte var1 = 1;
      byte var2 = 1;
      byte var3 = 1;
      var5.updateDate(var1, var2, var3);
   }
}
