import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0C8DB42071C0C081122608B579406C496F8B74DBBC21226FB55F4D3360DB1E14__207946937 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppCompatActivity.class);
      ActionBar var3 = ((AppCompatActivity)var2).getSupportActionBar();
      Object var1 = EasyMock.createMock(ViewGroup.class);
      var3.setCustomView((View)var1);
   }
}
