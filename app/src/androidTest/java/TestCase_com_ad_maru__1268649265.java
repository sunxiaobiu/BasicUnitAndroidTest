import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ad_maru__1268649265 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Intent.class);
      Bundle var4 = ((Intent)var3).getExtras();
      var3 = var4.get("pdus");
      Object[] var5 = (Object[])var3;
      int var6 = var5.length;
      SmsMessage[] var7 = new SmsMessage[var6];
      SmsMessage var8 = var7[0];
      long var1 = var8.getTimestampMillis();
   }
}
