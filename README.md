Information Security Lab — Experiments 8–12
Based on the Information Security Lab Manual 2026–27, Department of Computer Science & Engineering, D. Y. Patil College of Engineering & Technology, Kolhapur.
Overview
This README summarizes the practical work for Experiments 8–12. These experiments are primarily tool-based; the SSL protocol simulation listed under Experiment 11 is the explicitly program-oriented part.
Experiment	Topic	Main tool / approach
8	Implementation of PGP Operations Using GnuPG Command Line	GnuPG / Gpg4win
9	Implementation of Secure Email Using Pretty Good Privacy (PGP)	Gpg4win or GnuPG, Kleopatra, Mozilla Thunderbird, two email accounts
10	Network Traffic Analysis Tool (Ethereal/Wireshark)	Wireshark
11	Identify non-cryptographic protocol vulnerabilities; write a program for SSL protocol simulation	Authorized lab environment; Java may be used for an educational SSL/TLS demonstration
12	Experiment with software vulnerability tools and their analysis (Rootkit/Any other)	A suitable security-analysis tool in an isolated lab


Numbering note: The experiment list in the manual contains inconsistent numbering around Experiments 9–11. Follow the title given by your instructor when labeling submissions.

Requirements
- Windows or Linux computer.
- Java Development Kit (JDK), if completing a Java-based SSL/TLS demonstration.
- GnuPG on Linux, or Gpg4win on Windows.
- Kleopatra and Mozilla Thunderbird for the secure-email workflow.
- Wireshark for network traffic analysis.
- Approved vulnerability-analysis tools and an isolated, authorized lab environment for Experiment 11/12 activities.
Experiment 8 — PGP Operations Using GnuPG CLI
Aim: Perform PGP operations using the GnuPG command-line interface, including key generation, encryption, decryption, digital signing, signature verification, public-key export, and public-key import.
Check GnuPG
gpg --version
Generate a key pair
gpg --full-generate-key
Follow the prompts. Keep the private key and passphrase secret.
List keys
gpg --list-keys
gpg --list-secret-keys
Create a sample message
Create message.txt with some non-sensitive test text.
Export a public key
Replace the example address with the user ID associated with your key.
gpg --armor --export your-email@example.com > publickey.asc
Import a recipient's public key
gpg --import recipient-publickey.asc
Verify the key fingerprint with the recipient through a trusted channel before using it.
Encrypt a file for a recipient
gpg --output message.txt.gpg --encrypt --recipient recipient@example.com message.txt
Decrypt the file
gpg --output decrypted.txt --decrypt message.txt.gpg
Create and verify a detached signature
gpg --output message.txt.sig --detach-sign message.txt
gpg --verify message.txt.sig message.txt
Expected outcome: Demonstrate public-key export/import, encryption/decryption, and digital-signature creation/verification.
Experiment 9 — Secure Email Using PGP
Aim: Demonstrate secure email communication using PGP by generating keys, encrypting/decrypting email, and creating/verifying digital signatures.
Suggested workflow
1. Install Gpg4win on Windows or GnuPG on Linux.
2. Open Kleopatra and create an OpenPGP certificate for each participant.
3. Export each participant's public key and exchange public keys.
4. Verify key fingerprints through a separate trusted channel.
5. Configure the OpenPGP key in Mozilla Thunderbird under its end-to-end encryption settings.
6. Compose a test email and enable encryption and signing.
7. Send it to the other test account.
8. On the receiving account, decrypt the email and verify the signature.
Requirements from the manual: Gpg4win (Windows) / GnuPG (Linux), Kleopatra, Mozilla Thunderbird, and two email accounts.

Expected outcome: Demonstrate confidentiality, integrity, authentication, and non-repudiation features supported by PGP when keys are properly verified and managed.
Experiment 10 — Network Traffic Analysis Using Wireshark
Aim: Study a network traffic analysis tool (Ethereal/Wireshark).
Suggested workflow
1. Install Wireshark from its official website.
2. Open Wireshark and select a network interface you are authorized to monitor.
3. Start a capture.
4. Generate ordinary test traffic, such as visiting a permitted test website.
5. Stop the capture.
6. Apply display filters to narrow the packets being inspected. Examples:
dns
tcp
tls
http
7. Select packets and inspect protocol details and packet fields.
8. Save the capture (.pcapng) if permitted by your lab rules.
Expected outcome: Identify packets and inspect protocol fields using Wireshark.

Safety and privacy: Capture only traffic you own or have explicit permission to analyze. Do not collect or share other people's credentials or private traffic.
Experiment 11 — Protocol Vulnerabilities and SSL Protocol Simulation
The manual lists non-cryptographic protocol vulnerability topics such as honeypot monitoring, DDoS, buffer overflow, and SQL injection, and also asks for a program for SSL protocol simulation.
Vulnerability study
Perform demonstrations only in an isolated lab or on systems for which you have explicit authorization. Record the tool, test setup, observed behavior, defensive measures, and conclusion. Do not test attacks against public or third-party systems.
Java SSL/TLS demonstration
For a Java implementation, use Java's standard JSSE APIs (SSLContext, SSLSocket/SSLServerSocket, or SSLEngine) to demonstrate a protected client-server connection. Use a test certificate in a lab environment and configure trust explicitly. Prefer modern TLS configurations; do not implement cryptographic primitives yourself.

A Java SSL/TLS demonstration is a separate programmatic exercise and is not a replacement for any instructor-required vulnerability-tool demonstrations.

Expected outcome: Explain the purpose of TLS, establish a test client-server connection, and observe successful or failed certificate validation.
Experiment 12 — Software Vulnerability Tools and Analysis
Aim: Experiment with software vulnerability tools and analyze their results (rootkit or another suitable tool).
Suggested workflow
1. Confirm the tool and scope with the instructor.
2. Use a disposable virtual machine or isolated lab system.
3. Run the approved scanner or analysis tool.
4. Record findings, severity labels, evidence, and the tool's limitations.
5. Research defensive remediation for each finding.
6. Re-run the check after remediation where appropriate.
Expected outcome: Produce a short report of findings, analysis, and recommended defensive actions.

Safety: Do not install or execute unknown rootkits on a personal or production computer. Use only instructor-approved samples and an isolated virtual machine.
Java code and project organization
Experiments 8–10 and 12 are primarily tool-based in the manual. Experiment 11 explicitly includes an SSL protocol simulation program. If implementing that part in Java, keep it separate from the tool-based reports.

Example project layout:
information-security-lab/
├── README.md
├── exp08-pgp-gnupg/
├── exp09-secure-email-pgp/
├── exp10-wireshark/
├── exp11-vulnerability-and-tls/
└── exp12-vulnerability-tools/
If you add Java source files, compile and run them with the JDK, for example:
javac Example.java
java Example
Replace Example.java with the actual source filename and class name.
Lab report checklist
For each experiment, include:
- Experiment number and title
- Aim
- Requirements
- Theory / brief working principle
- Procedure or commands
- Screenshots or sample output, where required
- Observations
- Result / conclusion
- Defensive and safety considerations, where relevant
References
- Information Security Lab Manual 2026–27, D. Y. Patil College of Engineering & Technology, Kolhapur.
- GnuPG documentation: https://gnupg.org/documentation/
- Wireshark documentation: https://www.wireshark.org/docs/
- Java Secure Socket Extension (JSSE) Reference Guide: https://docs.oracle.com/en/java/javase/
