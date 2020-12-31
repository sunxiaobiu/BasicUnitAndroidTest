import android.text.Editable;
import android.text.TextWatcher;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_applisto_copyevents_2145673646 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(TextWatcher.class);
      ((TextWatcher)var1).afterTextChanged((Editable)null);
   }
}
