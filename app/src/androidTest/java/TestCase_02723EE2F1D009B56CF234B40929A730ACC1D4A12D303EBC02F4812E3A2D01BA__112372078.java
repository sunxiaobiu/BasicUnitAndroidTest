import android.content.res.ColorStateList;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02723EE2F1D009B56CF234B40929A730ACC1D4A12D303EBC02F4812E3A2D01BA__112372078 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(EditText.class);
      AppCompatEditText var3 = (AppCompatEditText)var2;
      Object var1 = EasyMock.createMock(ColorStateList.class);
      var3.setSupportBackgroundTintList((ColorStateList)var1);
   }
}
