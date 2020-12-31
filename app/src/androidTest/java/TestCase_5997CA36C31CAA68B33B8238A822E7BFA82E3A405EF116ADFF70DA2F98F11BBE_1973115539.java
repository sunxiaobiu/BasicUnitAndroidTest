import android.content.res.ColorStateList;
import android.support.v7.widget.AppCompatEditText;
import android.widget.EditText;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5997CA36C31CAA68B33B8238A822E7BFA82E3A405EF116ADFF70DA2F98F11BBE_1973115539 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(EditText.class);
      AppCompatEditText var3 = (AppCompatEditText)var2;
      Object var1 = EasyMock.createMock(ColorStateList.class);
      var3.setSupportBackgroundTintList((ColorStateList)var1);
   }
}
