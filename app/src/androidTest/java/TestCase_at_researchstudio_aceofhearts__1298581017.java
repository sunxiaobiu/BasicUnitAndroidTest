import android.app.Dialog;
import android.app.TimePickerDialog;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_at_researchstudio_aceofhearts__1298581017 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Dialog.class);
      TimePickerDialog var4 = (TimePickerDialog)var3;
      byte var1 = 1;
      byte var2 = 1;
      var4.updateTime(var1, var2);
   }
}
