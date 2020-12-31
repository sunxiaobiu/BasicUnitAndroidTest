import android.app.TimePickerDialog;
import android.content.DialogInterface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_38A614208A9231B84F176DFD756DBFD034B5F20E4476AFC990762CD48F97BEF8__694291520 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(TimePickerDialog.class);
      Object var1 = EasyMock.createMock(DialogInterface.class);
      ((TimePickerDialog)var2).onClick((DialogInterface)var1, -1);
   }
}
