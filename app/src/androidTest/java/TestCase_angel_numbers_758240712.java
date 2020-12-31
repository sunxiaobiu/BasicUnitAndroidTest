import android.text.Editable;
import android.widget.EditText;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_angel_numbers_758240712 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(EditText.class);
      Editable var3 = ((EditText)var2).getText();
      char var1 = ' ';
      var3.append(var1);
   }
}
