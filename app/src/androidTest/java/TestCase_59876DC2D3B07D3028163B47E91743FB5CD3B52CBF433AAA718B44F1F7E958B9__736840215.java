import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59876DC2D3B07D3028163B47E91743FB5CD3B52CBF433AAA718B44F1F7E958B9__736840215 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppCompatActivity.class);
      Context var3 = ((AppCompatActivity)var2).getApplicationContext();
      Object var1 = EasyMock.createMock(Uri.class);
      var3.revokeUriPermission((Uri)var1, 3);
   }
}
