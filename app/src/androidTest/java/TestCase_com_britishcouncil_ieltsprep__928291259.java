import android.support.v7.widget.AppCompatRadioButton;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_britishcouncil_ieltsprep__928291259 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppCompatRadioButton.class);
      byte var1 = 1;
      ((AppCompatRadioButton)var2).setHighlightColor(var1);
   }
}
